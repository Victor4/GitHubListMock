package com.vb.domain.mapper

import com.vb.data.model.RepoDTO
import com.vb.domain.model.RepoDBO

fun RepoDTO.toRepoDBO() : RepoDBO{
    return RepoDBO(this.name)
}

fun RepoDTO.toRepoDBOPrivate() : RepoDBO{
    return if(this.fullName.contains("private")){
        RepoDBO(this.name)
    }else{
        RepoDBO("")
    }
}