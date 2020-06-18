package com.kmwork.domain

import com.kmwork.domain.interactor.StepsInteractor
import com.kmwork.domain.usecase.StepsUseCase
import org.koin.dsl.module

val interactorModule = module {
    single<StepsInteractor>{StepsUseCase()}
}