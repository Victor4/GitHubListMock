package com.vb.domain.interactor

import com.vb.data.repositories.GitHubRepository
import com.vb.domain.mapper.toRepoDBO
import com.vb.domain.model.RepoDBO

class GetGitHubProjectsUseCaseImpl(val repository: GitHubRepository) : GetGitHubProjectsUseCase{


    override fun invoke(): List<RepoDBO> = repository.getGitHubProjects("Victor4").map {
        it.toRepoDBO()
    }
}

interface GetGitHubProjectsUseCase {
    operator fun invoke(): List<RepoDBO>
}


