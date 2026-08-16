package com.devanshi.contact_management.repository;

import com.devanshi.contact_management.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}