package dgitc.unam.dogapi

import com.google.gson.annotations.SerializedName
data class ModeloDog(
    @SerializedName("message") var images:List<String>)