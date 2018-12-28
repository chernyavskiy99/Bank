public class Main {
    public static void main(String[] args) {

        Client client = Client.builder()
                .withFirstName("Vova")
                .withSecondName("Gybanov")
                .build();
        System.out.println(client);
    }
}
