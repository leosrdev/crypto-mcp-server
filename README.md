## Crypto MCP Server

This project uses the [Model Context Protocol (MCP)](https://modelcontextprotocol.io/) server built with [Spring AI](https://docs.spring.io/spring-ai/reference/api/mcp/mcp-overview.html) and fetches real-time cryptocurrency prices from the [coingecko API](https://www.coingecko.com/en/api) and exposes them via an MCP-compliant interface, allowing easy integration with AI agents and automation systems.

![image](https://github.com/user-attachments/assets/9aa036ec-7c2f-4b7b-8946-eb658b4d5414)

## Features

- **MCP Protocol Support**: Implements the MCP server protocol using Spring AI for seamless interoperability.
- **Real-Time Crypto Prices**: Fetches up-to-date prices for various cryptocurrencies from the CoinGecko API.
- **Spring Boot Integration**: Built on top of Spring Boot for easy configuration, extension, and deployment.
- **Extensible**: Easily add support for more cryptocurrencies or data sources.

## Getting Started

### Prerequisites

- Java 17 or later
- Maven

### Generate the JAR package
```shell
mvn clean package
```

### JSON for this (local) MCP server
```json
{
    "mcpServers": {
        "crypto-price": {
            "command": "/opt/homebrew/opt/openjdk@17/libexec/openjdk.jdk/Contents/Home/bin/java",
            "args": ["-jar", "/Users/{user}/projects/crypto-mcp-server/target/crypto-0.0.1-SNAPSHOT.jar"]
        }
    }
}
```
See: https://modelcontextprotocol.io/quickstart/user#2-add-the-filesystem-mcp-server

### Example of prompt on Claude desktop
![image](https://github.com/user-attachments/assets/e705489a-9e61-4a0a-bf1d-a10bfa541a00)


