package com.palettering.api.palettering.post.hashtag.repository;

import com.palettering.api.palettering.post.hashtag.domain.Hashtag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HashtagRepository extends JpaRepository<Hashtag, Long> {
}
