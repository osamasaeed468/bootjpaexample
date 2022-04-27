package com.jpa.test;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@SpringBootApplication
public class BootjpaexampleApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);

        UserRepository userRepository = context.getBean(UserRepository.class);

//        //Create object of user
//        User user1 = new User();
//        user1.setName("Osama Saeed");
//        user1.setCity("Lahore");
//        user1.setStatus("I am java programmer");
//
//
//
//        User user2 = new User();
//        user2.setName("ali");
//        user2.setCity("Lahore");
//        user2.setStatus("I am js programmer");
//
//        List<User> users = List.of(user1,user2);
//        //save multiple objects
//        Iterable<User> result = userRepository.saveAll(users);
//
//        result.forEach(user->{
//            System.out.println(user);
//        });

//        //update the user of id = 7
//        Optional<User> optional = userRepository.findById(7);
//        User user = optional.get();
//
//        user.setName("Salman iqbal");
//        User result = userRepository.save(user);
//        System.out.println(result);


        //how to get data
        //findbyid(id) return optional containing your data
        Iterable<User> itr = userRepository.findAll();
//        Iterator<User> iterator = itr.iterator();
//        while (iterator.hasNext())
//        {
//            User user = iterator.next();
//            System.out.println(user);
//        }
//        itr.forEach(new Consumer<User>() {
//            @Override
//            public void accept(User t) {
//                System.out.println(t);
//            }
//        });

        //Delete the user element
        userRepository.deleteById(7);
        System.out.println("deleted");
    }

}
