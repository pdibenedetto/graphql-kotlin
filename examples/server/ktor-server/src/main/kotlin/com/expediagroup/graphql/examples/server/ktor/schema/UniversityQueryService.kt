/*
 * Copyright 2023 Expedia, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.expediagroup.graphql.examples.server.ktor.schema

import com.expediagroup.graphql.examples.server.ktor.schema.dataloaders.UniversityDataLoader
import com.expediagroup.graphql.examples.server.ktor.schema.models.University
import com.expediagroup.graphql.server.extensions.getValuesFromDataLoader
import com.expediagroup.graphql.server.operations.Query
import graphql.schema.DataFetchingEnvironment
import java.util.concurrent.CompletableFuture

class UniversityQueryService : Query {
    fun searchUniversities(params: UniversitySearchParameters, dfe: DataFetchingEnvironment): CompletableFuture<List<University>> =
        dfe.getValuesFromDataLoader(UniversityDataLoader.dataLoaderName, params.ids)
}

data class UniversitySearchParameters(val ids: List<Int>)
