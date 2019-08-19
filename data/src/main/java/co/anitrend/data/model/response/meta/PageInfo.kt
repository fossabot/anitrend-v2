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

package co.anitrend.data.model.response.meta

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/** [PageInfo](https://anilist.github.io/ApiV2-GraphQL-Docs/pageinfo)
 *
 * @param currentPage The current page
 * @param hasNextPage If there is another page
 * @param lastPage The last page
 * @param perPage The count on a page
 * @param total The total number of items
 */
@Parcelize
data class PageInfo(
    val currentPage: Int,
    val hasNextPage: Boolean,
    val lastPage: Int,
    val perPage: Int,
    val total: Int
) : Parcelable