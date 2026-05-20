@Component
public class ResourceFileReader implements Reader {

    private final String fileName;

    public ResourceFileReader(@Value("${products.file-name}") String fileName) {
        this.fileName = fileName;
    }

    @PostConstruct
    public void init() {
        System.out.println("ResourceFileReader initialized at " + LocalDateTime.now());
    }
}