// File generated from our OpenAPI spec by Stainless.

package com.agu_token.api.services.blocking

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
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface UserService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserService

    /** This can only be done by the logged in user. */
    fun create(): User = create(UserCreateParams.none())

    /** @see [create] */
    fun create(
        params: UserCreateParams = UserCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User

    /** @see [create] */
    fun create(params: UserCreateParams = UserCreateParams.none()): User =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): User =
        create(UserCreateParams.none(), requestOptions)

    /** Get user by user name */
    fun retrieve(username: String): User = retrieve(username, UserRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        username: String,
        params: UserRetrieveParams = UserRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User = retrieve(params.toBuilder().username(username).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(username: String, params: UserRetrieveParams = UserRetrieveParams.none()): User =
        retrieve(username, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User

    /** @see [retrieve] */
    fun retrieve(params: UserRetrieveParams): User = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(username: String, requestOptions: RequestOptions): User =
        retrieve(username, UserRetrieveParams.none(), requestOptions)

    /** This can only be done by the logged in user. */
    fun update(existingUsername: String) = update(existingUsername, UserUpdateParams.none())

    /** @see [update] */
    fun update(
        existingUsername: String,
        params: UserUpdateParams = UserUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().existingUsername(existingUsername).build(), requestOptions)

    /** @see [update] */
    fun update(existingUsername: String, params: UserUpdateParams = UserUpdateParams.none()) =
        update(existingUsername, params, RequestOptions.none())

    /** @see [update] */
    fun update(params: UserUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see [update] */
    fun update(params: UserUpdateParams) = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(existingUsername: String, requestOptions: RequestOptions) =
        update(existingUsername, UserUpdateParams.none(), requestOptions)

    /** This can only be done by the logged in user. */
    fun delete(username: String) = delete(username, UserDeleteParams.none())

    /** @see [delete] */
    fun delete(
        username: String,
        params: UserDeleteParams = UserDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().username(username).build(), requestOptions)

    /** @see [delete] */
    fun delete(username: String, params: UserDeleteParams = UserDeleteParams.none()) =
        delete(username, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(params: UserDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see [delete] */
    fun delete(params: UserDeleteParams) = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(username: String, requestOptions: RequestOptions) =
        delete(username, UserDeleteParams.none(), requestOptions)

    /** Creates list of users with given input array */
    fun createWithList(): User = createWithList(UserCreateWithListParams.none())

    /** @see [createWithList] */
    fun createWithList(
        params: UserCreateWithListParams = UserCreateWithListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User

    /** @see [createWithList] */
    fun createWithList(params: UserCreateWithListParams = UserCreateWithListParams.none()): User =
        createWithList(params, RequestOptions.none())

    /** @see [createWithList] */
    fun createWithList(requestOptions: RequestOptions): User =
        createWithList(UserCreateWithListParams.none(), requestOptions)

    /** Logs user into the system */
    fun login(): String = login(UserLoginParams.none())

    /** @see [login] */
    fun login(
        params: UserLoginParams = UserLoginParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see [login] */
    fun login(params: UserLoginParams = UserLoginParams.none()): String =
        login(params, RequestOptions.none())

    /** @see [login] */
    fun login(requestOptions: RequestOptions): String =
        login(UserLoginParams.none(), requestOptions)

    /** Logs out current logged in user session */
    fun logout() = logout(UserLogoutParams.none())

    /** @see [logout] */
    fun logout(
        params: UserLogoutParams = UserLogoutParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [logout] */
    fun logout(params: UserLogoutParams = UserLogoutParams.none()) =
        logout(params, RequestOptions.none())

    /** @see [logout] */
    fun logout(requestOptions: RequestOptions) = logout(UserLogoutParams.none(), requestOptions)

    /** A view of [UserService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UserService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /user`, but is otherwise the same as
         * [UserService.create].
         */
        @MustBeClosed fun create(): HttpResponseFor<User> = create(UserCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: UserCreateParams = UserCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User>

        /** @see [create] */
        @MustBeClosed
        fun create(params: UserCreateParams = UserCreateParams.none()): HttpResponseFor<User> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<User> =
            create(UserCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /user/{username}`, but is otherwise the same as
         * [UserService.retrieve].
         */
        @MustBeClosed
        fun retrieve(username: String): HttpResponseFor<User> =
            retrieve(username, UserRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            username: String,
            params: UserRetrieveParams = UserRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User> =
            retrieve(params.toBuilder().username(username).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            username: String,
            params: UserRetrieveParams = UserRetrieveParams.none(),
        ): HttpResponseFor<User> = retrieve(username, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: UserRetrieveParams): HttpResponseFor<User> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(username: String, requestOptions: RequestOptions): HttpResponseFor<User> =
            retrieve(username, UserRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /user/{username}`, but is otherwise the same as
         * [UserService.update].
         */
        @MustBeClosed
        fun update(existingUsername: String): HttpResponse =
            update(existingUsername, UserUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            existingUsername: String,
            params: UserUpdateParams = UserUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            update(params.toBuilder().existingUsername(existingUsername).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            existingUsername: String,
            params: UserUpdateParams = UserUpdateParams.none(),
        ): HttpResponse = update(existingUsername, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [update] */
        @MustBeClosed
        fun update(params: UserUpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(existingUsername: String, requestOptions: RequestOptions): HttpResponse =
            update(existingUsername, UserUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /user/{username}`, but is otherwise the same as
         * [UserService.delete].
         */
        @MustBeClosed
        fun delete(username: String): HttpResponse = delete(username, UserDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            username: String,
            params: UserDeleteParams = UserDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().username(username).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            username: String,
            params: UserDeleteParams = UserDeleteParams.none(),
        ): HttpResponse = delete(username, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: UserDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: UserDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(username: String, requestOptions: RequestOptions): HttpResponse =
            delete(username, UserDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /user/createWithList`, but is otherwise the same as
         * [UserService.createWithList].
         */
        @MustBeClosed
        fun createWithList(): HttpResponseFor<User> =
            createWithList(UserCreateWithListParams.none())

        /** @see [createWithList] */
        @MustBeClosed
        fun createWithList(
            params: UserCreateWithListParams = UserCreateWithListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User>

        /** @see [createWithList] */
        @MustBeClosed
        fun createWithList(
            params: UserCreateWithListParams = UserCreateWithListParams.none()
        ): HttpResponseFor<User> = createWithList(params, RequestOptions.none())

        /** @see [createWithList] */
        @MustBeClosed
        fun createWithList(requestOptions: RequestOptions): HttpResponseFor<User> =
            createWithList(UserCreateWithListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /user/login`, but is otherwise the same as
         * [UserService.login].
         */
        @MustBeClosed fun login(): HttpResponseFor<String> = login(UserLoginParams.none())

        /** @see [login] */
        @MustBeClosed
        fun login(
            params: UserLoginParams = UserLoginParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see [login] */
        @MustBeClosed
        fun login(params: UserLoginParams = UserLoginParams.none()): HttpResponseFor<String> =
            login(params, RequestOptions.none())

        /** @see [login] */
        @MustBeClosed
        fun login(requestOptions: RequestOptions): HttpResponseFor<String> =
            login(UserLoginParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /user/logout`, but is otherwise the same as
         * [UserService.logout].
         */
        @MustBeClosed fun logout(): HttpResponse = logout(UserLogoutParams.none())

        /** @see [logout] */
        @MustBeClosed
        fun logout(
            params: UserLogoutParams = UserLogoutParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [logout] */
        @MustBeClosed
        fun logout(params: UserLogoutParams = UserLogoutParams.none()): HttpResponse =
            logout(params, RequestOptions.none())

        /** @see [logout] */
        @MustBeClosed
        fun logout(requestOptions: RequestOptions): HttpResponse =
            logout(UserLogoutParams.none(), requestOptions)
    }
}
