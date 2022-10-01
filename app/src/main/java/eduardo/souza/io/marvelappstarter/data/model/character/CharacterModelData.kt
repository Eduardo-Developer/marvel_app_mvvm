package eduardo.souza.io.marvelappstarter.data.model.character

import com.google.gson.annotations.SerializedName

data class CharacterModelData(
    @SerializedName("results")
    val results: List<CharacterModel>
)
