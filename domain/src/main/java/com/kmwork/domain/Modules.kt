package com.kmwork.domain

import com.kmwork.domain.interactor.MarkerMapInteractor
import com.kmwork.domain.interactor.StopsInteractor
import com.kmwork.domain.usecase.MarkerMapUseCase
import com.kmwork.domain.usecase.StopsUseCase
import org.koin.dsl.module

val interactorModule = module {
    factory <StopsInteractor>{StopsUseCase(get())}
    factory <MarkerMapInteractor>{ MarkerMapUseCase(get()) }
}