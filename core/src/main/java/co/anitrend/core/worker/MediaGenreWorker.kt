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

package co.anitrend.core.worker

import android.content.Context
import androidx.work.WorkerParameters
import co.anitrend.core.presenter.CorePresenter
import co.anitrend.data.usecase.media.meta.MediaGenreFetchUseCase
import io.wax911.support.core.worker.SupportCoroutineWorker
import org.koin.core.KoinComponent
import org.koin.core.inject

class MediaGenreWorker(
    context: Context,
    workerParameters: WorkerParameters
) : SupportCoroutineWorker<CorePresenter>(context, workerParameters), KoinComponent {

    private val mediaUseCase by inject<MediaGenreFetchUseCase>()

    /**
     * A suspending method to do your work.  This function runs on the coroutine context specified
     * by [coroutineContext].
     *
     * A CoroutineWorker is given a maximum of ten minutes to finish its execution and return a
     * [androidx.work.ListenableWorker.Result].  After this time has expired, the worker will be signalled to
     * stop.
     *
     * @return The [androidx.work.ListenableWorker.Result] of the result of the background work; note that
     * dependent work will not execute if you return [androidx.work.ListenableWorker.Result.failure]
     */
    override suspend fun doWork(): Result {
        val networkResult = mediaUseCase(null)

        if (networkResult.isLoaded())
            return Result.success()

        return Result.retry()
    }

    companion object {
        const val TAG = "co.anitrend.core:MediaGenreWorker"
    }
}