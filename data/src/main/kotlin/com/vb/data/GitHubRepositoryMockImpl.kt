package com.vb.data

import com.vb.data.model.RepoDTO
import com.vb.data.repositories.GitHubRepository

class GitHubRepositoryMockImpl() : GitHubRepository {

    override fun getGitHubProjects(name: String): List<RepoDTO> {
        return listOf(
            RepoDTO(1,"projeto 1", "projeto armagedon 1"),
            RepoDTO(2,"projeto 2", "projeto armagedon 2"),
            RepoDTO(3,"projeto 3", "projeto armagedon 3"),
            RepoDTO(4,"projeto 4", "projeto armagedon 4"),
        )
    }

}