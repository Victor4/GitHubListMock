package com.vb.home.ui

import androidx.lifecycle.ViewModel
import com.vb.domain.interactor.GetGitHubProjectsUseCaseImpl
import com.vb.domain.model.RepoDBO

class HomeViewModel(private val getGitHubProjectsUseCaseImpl: GetGitHubProjectsUseCaseImpl) : ViewModel() {

    fun getGitHubProjects(name : String): List<RepoDBO> {
        return getGitHubProjectsUseCaseImpl.invoke()
    }
}