## Crypto MCP Server

This project integrates the [Model Context Protocol (MCP)](https://modelcontextprotocol.io/) using a server built with [Spring AI](https://docs.spring.io/spring-ai/reference/api/mcp/mcp-overview.html).
It fetches real-time cryptocurrency prices from the [CoinGecko API](https://www.coingecko.com/en/api) and exposes the data through an MCP-compliant interface.
This enables seamless integration with AI agents, automation tools, and intelligent applications that depend on structured, real-time financial data.  

![image](https://github.com/user-attachments/assets/9aa036ec-7c2f-4b7b-8946-eb658b4d5414)

See: https://github.com/modelcontextprotocol  

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

### Learn more
- https://smithery.ai
- https://mcp.so


