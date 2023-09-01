package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.PostEntity;



public interface PostService {
 
	PostEntity create(PostEntity post);
	PostEntity update(PostEntity post);
	void delete(Long id);
	PostEntity read(Long id);
	List<PostEntity> readAll();

}
