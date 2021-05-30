package com.vb.domain.module

import com.vb.data.GitHubRepositoryMockImpl
import com.vb.data.repositories.GitHubRepository
import com.vb.domain.interactor.GetGitHubProjectsUseCaseImpl
import org.koin.dsl.module

val gitHubRepositoryModule = module {

    single<GitHubRepository> { GitHubRepositoryMockImpl() }

    factory { GetGitHubProjectsUseCaseImpl(get()) }
}