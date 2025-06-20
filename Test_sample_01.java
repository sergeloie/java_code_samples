@SpringBootTest 
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RepositoryTest {

// получаем из контекста все репозитории
    @Autowired
    private List<CrudRepository<?, Long>> repositories;

    @Autowired
    private EMDOuterRegistryRepository emdOuterRegistryRepository;

    private Stream<CrudRepository<?, Long>> provideRepositories() {
        return repositories.stream();
    }

    @ParameterizedTest
    @MethodSource("provideRepositories")
  // извлекаем из прокси реальное имя класса репозитория
    void testFindById(CrudRepository<?, Long> repository) {
        if (!AopProxyUtils.proxiedUserInterfaces(repository)[0].getSimpleName().equals("EMDVersionPMIRepository")) {
            assertDoesNotThrow(() -> repository.findById(0L));
        }
    }
}
