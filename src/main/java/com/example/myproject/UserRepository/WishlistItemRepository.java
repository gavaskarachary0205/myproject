package com.example.myproject.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myproject.entity.WishlistItem;





public interface WishlistItemRepository extends JpaRepository<WishlistItem, Long> {

}
