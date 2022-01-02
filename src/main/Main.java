public class Main {

    static final String JAVA = "java";
    static final String KOTLIN = "kotlin";
    
    public static void main(String[] args) {
        String language = args[0];
        switch (language) {
            case JAVA:
                new JavaClass().callOutput();
                break;
            case KOTLIN:
                new KotlinClass().callOutput();
                break;
            default:
                System.out.println("Hello World");
                break;
        }
    }
}