// File generated from our OpenAPI spec by Stainless.

package com.agu_token.api.services.async

import com.agu_token.api.core.ClientOptions
import com.agu_token.api.core.RequestOptions
import com.agu_token.api.core.http.HttpResponse
import com.agu_token.api.core.http.HttpResponseFor
import com.agu_token.api.models.user.User
import com.agu_token.api.models.user.UserCreateParams
import com.agu_token.api.models.user.UserCreateWithListParams
import com.agu_token.api.models.user.UserDeleteParams
import com.agu_token.api.models.user.UserLoginParams
import com.agu_token.api.models.user.UserLogoutParams
import com.agu_token.api.models.user.UserRetrieveParams
import com.agu_token.api.models.user.UserUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UserServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync

    /** This can only be done by the logged in user. */
    fun create(): CompletableFuture<User> = create(UserCreateParams.none())

    /** @see [create] */
    fun create(
        params: UserCreateParams = UserCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<User>

    /** @see [create] */
    fun create(params: UserCreateParams = UserCreateParams.none()): CompletableFuture<User> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): CompletableFuture<User> =
        create(UserCreateParams.none(), requestOptions)

    /** Get user by user name */
    fun retrieve(username: String): CompletableFuture<User> =
        retrieve(username, UserRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        username: String,
        params: UserRetrieveParams = UserRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<User> =
        retrieve(params.toBuilder().username(username).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        username: String,
        params: UserRetrieveParams = UserRetrieveParams.none(),
    ): CompletableFuture<User> = retrieve(username, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<User>

    /** @see [retrieve] */
    fun retrieve(params: UserRetrieveParams): CompletableFuture<User> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(username: String, requestOptions: RequestOptions): CompletableFuture<User> =
        retrieve(username, UserRetrieveParams.none(), requestOptions)

    /** This can only be done by the logged in user. */
    fun update(existingUsername: String): CompletableFuture<Void?> =
        update(existingUsername, UserUpdateParams.none())

    /** @see [update] */
    fun update(
        existingUsername: String,
        params: UserUpdateParams = UserUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        update(params.toBuilder().existingUsername(existingUsername).build(), requestOptions)

    /** @see [update] */
    fun update(
        existingUsername: String,
        params: UserUpdateParams = UserUpdateParams.none(),
    ): CompletableFuture<Void?> = update(existingUsername, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [update] */
    fun update(params: UserUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(existingUsername: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        update(existingUsername, UserUpdateParams.none(), requestOptions)

    /** This can only be done by the logged in user. */
    fun delete(username: String): CompletableFuture<Void?> =
        delete(username, UserDeleteParams.none())

    /** @see [delete] */
    fun delete(
        username: String,
        params: UserDeleteParams = UserDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().username(username).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        username: String,
        params: UserDeleteParams = UserDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(username, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: UserDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [delete] */
    fun delete(params: UserDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(username: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(username, UserDeleteParams.none(), requestOptions)

    /** Creates list of users with given input array */
    fun createWithList(): CompletableFuture<User> = createWithList(UserCreateWithListParams.none())

    /** @see [createWithList] */
    fun createWithList(
        params: UserCreateWithListParams = UserCreateWithListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<User>

    /** @see [createWithList] */
    fun createWithList(
        params: UserCreateWithListParams = UserCreateWithListParams.none()
    ): CompletableFuture<User> = createWithList(params, RequestOptions.none())

    /** @see [createWithList] */
    fun createWithList(requestOptions: RequestOptions): CompletableFuture<User> =
        createWithList(UserCreateWithListParams.none(), requestOptions)

    /** Logs user into the system */
    fun login(): CompletableFuture<String> = login(UserLoginParams.none())

    /** @see [login] */
    fun login(
        params: UserLoginParams = UserLoginParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /** @see [login] */
    fun login(params: UserLoginParams = UserLoginParams.none()): CompletableFuture<String> =
        login(params, RequestOptions.none())

    /** @see [login] */
    fun login(requestOptions: RequestOptions): CompletableFuture<String> =
        login(UserLoginParams.none(), requestOptions)

    /** Logs out current logged in user session */
    fun logout(): CompletableFuture<Void?> = logout(UserLogoutParams.none())

    /** @see [logout] */
    fun logout(
        params: UserLogoutParams = UserLogoutParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [logout] */
    fun logout(params: UserLogoutParams = UserLogoutParams.none()): CompletableFuture<Void?> =
        logout(params, RequestOptions.none())

    /** @see [logout] */
    fun logout(requestOptions: RequestOptions): CompletableFuture<Void?> =
        logout(UserLogoutParams.none(), requestOptions)

    /** A view of [UserServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /user`, but is otherwise the same as
         * [UserServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<User>> = create(UserCreateParams.none())

        /** @see [create] */
        fun create(
            params: UserCreateParams = UserCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<User>>

        /** @see [create] */
        fun create(
            params: UserCreateParams = UserCreateParams.none()
        ): CompletableFuture<HttpResponseFor<User>> = create(params, RequestOptions.none())

        /** @see [create] */
        fun create(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<User>> =
            create(UserCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /user/{username}`, but is otherwise the same as
         * [UserServiceAsync.retrieve].
         */
        fun retrieve(username: String): CompletableFuture<HttpResponseFor<User>> =
            retrieve(username, UserRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            username: String,
            params: UserRetrieveParams = UserRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<User>> =
            retrieve(params.toBuilder().username(username).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            username: String,
            params: UserRetrieveParams = UserRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<User>> =
            retrieve(username, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<User>>

        /** @see [retrieve] */
        fun retrieve(params: UserRetrieveParams): CompletableFuture<HttpResponseFor<User>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            username: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<User>> =
            retrieve(username, UserRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /user/{username}`, but is otherwise the same as
         * [UserServiceAsync.update].
         */
        fun update(existingUsername: String): CompletableFuture<HttpResponse> =
            update(existingUsername, UserUpdateParams.none())

        /** @see [update] */
        fun update(
            existingUsername: String,
            params: UserUpdateParams = UserUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().existingUsername(existingUsername).build(), requestOptions)

        /** @see [update] */
        fun update(
            existingUsername: String,
            params: UserUpdateParams = UserUpdateParams.none(),
        ): CompletableFuture<HttpResponse> = update(existingUsername, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [update] */
        fun update(params: UserUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            existingUsername: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            update(existingUsername, UserUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /user/{username}`, but is otherwise the same as
         * [UserServiceAsync.delete].
         */
        fun delete(username: String): CompletableFuture<HttpResponse> =
            delete(username, UserDeleteParams.none())

        /** @see [delete] */
        fun delete(
            username: String,
            params: UserDeleteParams = UserDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().username(username).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            username: String,
            params: UserDeleteParams = UserDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(username, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: UserDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [delete] */
        fun delete(params: UserDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            username: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(username, UserDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /user/createWithList`, but is otherwise the same as
         * [UserServiceAsync.createWithList].
         */
        fun createWithList(): CompletableFuture<HttpResponseFor<User>> =
            createWithList(UserCreateWithListParams.none())

        /** @see [createWithList] */
        fun createWithList(
            params: UserCreateWithListParams = UserCreateWithListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<User>>

        /** @see [createWithList] */
        fun createWithList(
            params: UserCreateWithListParams = UserCreateWithListParams.none()
        ): CompletableFuture<HttpResponseFor<User>> = createWithList(params, RequestOptions.none())

        /** @see [createWithList] */
        fun createWithList(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<User>> =
            createWithList(UserCreateWithListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /user/login`, but is otherwise the same as
         * [UserServiceAsync.login].
         */
        fun login(): CompletableFuture<HttpResponseFor<String>> = login(UserLoginParams.none())

        /** @see [login] */
        fun login(
            params: UserLoginParams = UserLoginParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /** @see [login] */
        fun login(
            params: UserLoginParams = UserLoginParams.none()
        ): CompletableFuture<HttpResponseFor<String>> = login(params, RequestOptions.none())

        /** @see [login] */
        fun login(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<String>> =
            login(UserLoginParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /user/logout`, but is otherwise the same as
         * [UserServiceAsync.logout].
         */
        fun logout(): CompletableFuture<HttpResponse> = logout(UserLogoutParams.none())

        /** @see [logout] */
        fun logout(
            params: UserLogoutParams = UserLogoutParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [logout] */
        fun logout(
            params: UserLogoutParams = UserLogoutParams.none()
        ): CompletableFuture<HttpResponse> = logout(params, RequestOptions.none())

        /** @see [logout] */
        fun logout(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            logout(UserLogoutParams.none(), requestOptions)
    }
}
