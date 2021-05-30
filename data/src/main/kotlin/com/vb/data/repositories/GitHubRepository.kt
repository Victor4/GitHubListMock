package com.vb.data.repositories

import com.vb.data.model.RepoDTO

interface GitHubRepository {

    fun getGitHubProjects(name : String) : List<RepoDTO>
}