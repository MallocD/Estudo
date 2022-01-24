package nbs.imersaoJPAData;

import nbs.imersaoJPAData.model.User;
import nbs.imersaoJPAData.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {//Implementa a interface CommandLineRunner
        @Autowired
        private UserRepository userRepository;
        @Autowired
        private User user;

        @Override
        public void run(String... args) throws Exception {
            user.setName("João");
            user.setUsername("MallocD");
            user.setPassword("23443");

            userRepository.save(user);

            for(User u: userRepository.findAll()){
                System.out.println(u);
            }
    }
}
