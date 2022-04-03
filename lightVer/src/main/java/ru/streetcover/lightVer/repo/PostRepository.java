package ru.streetcover.lightVer.repo;

import org.springframework.data.repository.CrudRepository;
import ru.streetcover.lightVer.models.Post;

import java.util.Optional;

public interface PostRepository extends CrudRepository<Post, Long> {

}
