package ai.projects.mcp.crypto;

import ai.projects.mcp.crypto.server.MCPServer;
import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		 SpringApplication.run(Application.class, args);
	}

	@Bean
	public List<ToolCallback> listTools(MCPServer mcpServer) {
		return List.of(ToolCallbacks.from(mcpServer));
	}
}
