package eduardo.souza.io.marvelappstarter.repository

import eduardo.souza.io.marvelappstarter.data.local.MarvelDao
import eduardo.souza.io.marvelappstarter.data.model.character.CharacterModel
import eduardo.souza.io.marvelappstarter.data.remote.ServiceApi
import javax.inject.Inject

class MarvelRepository @Inject constructor(
    private val api: ServiceApi,
    private val dao: MarvelDao
) {
    suspend fun list(nameStartWith: String? = null) = api.list(nameStartWith)
    suspend fun getComics(characterId : Int) = api.getComics(characterId)

    suspend fun insert(characterModel: CharacterModel) = dao.insert(characterModel)
    fun getAll() = dao.getAll()
    suspend fun delete(characterModel: CharacterModel) = dao.delete(characterModel)
}