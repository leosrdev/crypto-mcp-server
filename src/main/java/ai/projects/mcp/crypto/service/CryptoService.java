package ai.projects.mcp.crypto.service;

import ai.projects.mcp.crypto.model.CryptoPrice;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class CryptoService {
    final String COIN_GECKO_URL = "https://api.coingecko.com";

    public CryptoPrice getPrice(String cryptoName) {
        WebClient webClient = WebClient.create(COIN_GECKO_URL);
        String uri = String.format("/api/v3/simple/price?ids=%s&vs_currencies=usd", cryptoName);

        try {
            String rawResponse = webClient.get()
                    .uri(uri)
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();

            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(rawResponse);
            JsonNode cryptoNode = root.get(cryptoName);

            if (cryptoNode != null && cryptoNode.has("usd")) {
                double price = cryptoNode.get("usd").asDouble();
                return new CryptoPrice(cryptoName, price, "USD", "success");
            } else {
                return new CryptoPrice(cryptoName, 0.0, "USD", "not_found");
            }
        } catch (Exception e) {
            return new CryptoPrice(cryptoName, 0.0, "USD", "error: " + e.getMessage());
        }
    }
}
