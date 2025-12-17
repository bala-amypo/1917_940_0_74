package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import 

@Entity
@Table(name = "branch_profiles")
@Data // Optional: If you use Lombok for Getters/Setters
public class BranchProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String branchCode;

    private String branchName;

    private String contactEmail;

    private LocalDateTime lastSyncAt;

    private Boolean active;

    
    @PrePersist
    protected void onCreate() {
        this.lastSyncAt = LocalDateTime.now();
    }

    
}