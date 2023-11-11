/*
        Exemplo de uma aplicação  - Teste

public class CandidatoGenericApplication implements CommandLineRunner {

    @Autowired
    private CandidatoRepository candidatoRepository;

    public static void main(String[] args) {
        SpringApplication.run(CandidatoGenericApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        CandidatoTODO c1 = new CandidatoTODO(id, "int", "nome_candidato", "partido", "votoTotal", LocalDateTime.parse("05/11/2023 08:00"), false);

        candidatoRepository.saveAll(Arrays.asList));
    }

}
 */