package sample

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Model (

    @SerialName("id")
    val id : String,

    @SerialName("favorite")
    val favorite : Boolean,

    @SerialName("title")
    val title : String
)