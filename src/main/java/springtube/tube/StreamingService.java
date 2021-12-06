package springtube.tube;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class StreamingService {
    @Autowired
    private ResourceLoader resourceLoader;

    public Mono<Resource> getVideo() {
        return Mono.fromSupplier(() -> this.resourceLoader.getResource("file:/mnt/inwork/spring/01_simple/spring-clean/tube/src/main/resources/video1.mp4"));
    }
}