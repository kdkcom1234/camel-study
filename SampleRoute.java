// camel-k: language=java

// 의존성 관리
//DEPS info.picocli:picocli:4.5.0
//DEPS org.apache.camel:camel-core-model:4.3.0

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

import org.apache.camel.builder.RouteBuilder;
public class SampleRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        // Write your routes here, for example:
        from("rest:get:hello")
            .transform().constant("Bye World");
    }
}
