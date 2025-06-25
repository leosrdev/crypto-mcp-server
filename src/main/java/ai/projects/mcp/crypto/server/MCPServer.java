package ai.projects.mcp.crypto.server;

import ai.projects.mcp.crypto.model.CryptoPrice;
import ai.projects.mcp.crypto.service.CryptoService;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

@Component
public class MCPServer {

    private final CryptoService cryptoService;

    public MCPServer(CryptoService cryptoService) {
        this.cryptoService = cryptoService;
    }

    @Tool(name = "get_crypto_price", description = "Gets the crypto currency price by crypto name")
    public CryptoPrice getPrice(String cryptoName) {
        return this.cryptoService.getPrice(cryptoName);
    }
}
