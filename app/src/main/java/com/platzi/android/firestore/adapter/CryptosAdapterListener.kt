package com.platzi.android.firestore.adapter

import com.platzi.android.firestore.model.Crypto

/**
 * @author Santiago Carrillo
 * 3/9/19.
 */

interface CryptosAdapterListener{

    fun onBuyCryptoClicked(crypto: Crypto)
}