package ir.sass.domain.repository

import ir.sass.base_domain.model.Domain
import ir.sass.domain.model.DiscoverMovieModel
import ir.sass.domain.model.ResultModel
import kotlinx.coroutines.flow.Flow

interface MovieRepository {
    fun discoverPopularMovies(page : Int): Flow<Domain<DiscoverMovieModel>>

    fun discoverTopMovies(page : Int): Flow<Domain<DiscoverMovieModel>>

    fun discoverMoviesFromLocal(): Flow<Domain<DiscoverMovieModel>>

    fun saveToLocal(model: ResultModel)

    fun deleteFromLocal(model: ResultModel)

    fun isExistOnDb(model: ResultModel) : Flow<Domain<Boolean>>
}