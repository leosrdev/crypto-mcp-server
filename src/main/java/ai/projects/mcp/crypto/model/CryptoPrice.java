package ai.projects.mcp.crypto.model;

public record CryptoPrice(
        String cryptoName,
        double price,
        String currency,
        String status
) {}
