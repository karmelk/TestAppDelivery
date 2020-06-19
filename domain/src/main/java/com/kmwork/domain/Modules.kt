package com.kmwork.domain

import com.kmwork.domain.interactor.StopsInteractor
import com.kmwork.domain.usecase.StopsUseCase
import org.koin.dsl.module

val interactorModule = module {
    factory <StopsInteractor>{StopsUseCase(get())}
}