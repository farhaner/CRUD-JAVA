package JavaApplication.JavaProjectKeempat;

import Repository.MahasiswaRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.springframework.boot.test.context.SpringBootTest;
//@SpringBootTest
@DataJpaTest
public class MahasiswaRepositoryTest {
    @Autowired
    private MahasiswaRepository mahasiswaRepository;
//        public MahasiswaRepositoryTest(MahasiswaRepository mahasiswaRepository) {
//        this.mahasiswaRepository = mahasiswaRepository;
//    }
    @Test
    void create(){
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setName("arfan");

        mahasiswaRepository.save(mahasiswa);

        assertNotNull(mahasiswa.getId());
    }
}
