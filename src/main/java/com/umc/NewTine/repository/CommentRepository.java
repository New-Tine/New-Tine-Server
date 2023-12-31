package com.umc.NewTine.repository;

import com.umc.NewTine.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByNewsId(Long newsId);
    List<Comment> findByNewsIdOrderByCreatedAtDesc(Long newsId);
    List<Comment> findByNewsIdOrderByLikesDesc(Long newsId);
}
