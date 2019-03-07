package com.platzi.android.firestore.model

/**
 * @author Santiago Carrillo
 * 3/7/19.
 */
class Crypto(var name: String = "", var imageUrl: String = "", var available: Int = 0) {
    fun getDocumentId(): String {
        return name.toLowerCase()
    }
}