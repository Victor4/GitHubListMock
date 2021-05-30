package com.vb.domain.interactor

import com.vb.data.repositories.GitHubRepository
import com.vb.domain.mapper.toRepoDBO
import com.vb.domain.model.RepoDBO

class GetGitHubPrivatedProjectsUseCaseImpl(val repository: GitHubRepository) : GetGitHubPrivatedProjectsUseCase {
    override fun invoke(): List<RepoDBO> {
        return repository.getGitHubProjects("victor").map {
            it.toRepoDBO()
        }
    }

}

interface GetGitHubPrivatedProjectsUseCase {
    operator fun invoke(): List<RepoDBO>
}