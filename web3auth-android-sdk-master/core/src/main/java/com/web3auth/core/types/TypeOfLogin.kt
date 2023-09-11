package com.web3auth.core.types

import com.google.gson.annotations.SerializedName

enum class TypeOfLogin {
    @SerializedName("google")
    GOOGLE,
    @SerializedName("facebook")
    FACEBOOK,
    @SerializedName("reddit")
    REDDIT,
    @SerializedName("discord")
    DISCORD,
    @SerializedName("twitch")
    TWITCH,
    @SerializedName("apple")
    APPLE,
    @SerializedName("line")
    LINE,
    @SerializedName("github")
    GITHUB,
    @SerializedName("kakao")
    KAKAO,
    @SerializedName("linkedin")
    LINKEDIN,
    @SerializedName("twitter")
    TWITTER,
    @SerializedName("weibo")
    WEIBO,
    @SerializedName("wechat")
    WECHAT,
    @SerializedName("email_passwordless")
    EMAIL_PASSWORDLESS,
    @SerializedName("email_password")
    EMAIL_PASSWORD,
    @SerializedName("jwt")
    JWT
}