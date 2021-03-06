/*
 * Copyright (C) 2019  AniTrend
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package co.anitrend.data.model.mutation.user

import co.anitrend.data.model.response.contract.IGraphQuery
import co.anitrend.data.model.input.MediaListOptionsInput
import co.anitrend.data.model.input.NotificationOption
import co.anitrend.data.usecase.media.attributes.ScoreFormat
import co.anitrend.data.usecase.user.attributes.UserTitleLanguage

/** [UpdateUser mutation](https://anilist.github.io/ApiV2-GraphQL-Docs/mutation.doc.html)
 *
 * @param about User's about/bio text
 * @param titleLanguage User's title language
 * @param displayAdultContent If the user should see media marked as adult-only
 * @param airingNotifications If the user should get notifications when a show they are watching aires
 * @param scoreFormat The user's list scoring system
 * @param rowOrder The user's default list order
 * @param profileColor Profile highlight color
 * @param notificationOptions Notification Options
 * @param animeListOptions The user's anime list options
 * @param mangaListOptions The user's anime list options
 */
data class UpdateUserMutation(
    val about: String?,
    val titleLanguage: UserTitleLanguage,
    val displayAdultContent: Boolean = false,
    val airingNotifications: Boolean = true,
    val scoreFormat: ScoreFormat,
    val rowOrder: String,
    val profileColor: String,
    val notificationOptions: List<NotificationOption>,
    val animeListOptions: MediaListOptionsInput,
    val mangaListOptions: MediaListOptionsInput
) : IGraphQuery {

    /**
     * A map serializer to build maps out of object so that we can consume them
     * using [io.github.wax911.library.model.request.QueryContainerBuilder].
     */
    override fun toMap() = mapOf(
        "about" to about,
        "titleLanguage" to titleLanguage,
        "displayAdultContent" to displayAdultContent,
        "airingNotifications" to airingNotifications,
        "scoreFormat" to scoreFormat,
        "rowOrder" to rowOrder,
        "profileColor" to profileColor,
        "notificationOptions" to notificationOptions,
        "animeListOptions" to animeListOptions.toMap(),
        "mangaListOptions" to mangaListOptions.toMap()
    )
}