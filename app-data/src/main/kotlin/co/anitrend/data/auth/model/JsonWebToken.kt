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

package co.anitrend.data.auth.model

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

/**
 * Json Web Token from Implicit Grant see implicit grant manual docs at:
 * https://anilist.gitbook.io/anilist-apiv2-docs/overview/oauth/implicit-grant
 */
@Entity(
    indices = [
        Index(
            value = ["userId", "accessToken"],
            unique = true
        )
    ]
)
data class JsonWebToken(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val userId: Long,
    val accessToken: String
) {
    fun getTokenKey() = "Bearer $accessToken"
}