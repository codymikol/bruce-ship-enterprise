package com.example.bruce.repositories

import com.example.bruce.domain.Version
import org.springframework.data.jpa.repository.JpaRepository

interface VersionRepository : JpaRepository<Version, Long> {}