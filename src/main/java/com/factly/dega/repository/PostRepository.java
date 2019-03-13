package com.factly.dega.repository;

import com.factly.dega.domain.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data MongoDB repository for the Post entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PostRepository extends DegaCustomRepository<Post, String> {
    @Query("{}")
    Page<Post> findAllWithEagerRelationships(Pageable pageable);

    @Query("{}")
    List<Post> findAllWithEagerRelationships();

    @Query("{'id': ?0}")
    Optional<Post> findOneWithEagerRelationships(String id);

}
