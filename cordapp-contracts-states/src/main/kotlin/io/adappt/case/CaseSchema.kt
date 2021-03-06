/**
 *   Copyright 2019, Dapps Incorporated.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */


package io.adappt.case




import net.corda.core.schemas.MappedSchema
import net.corda.core.schemas.PersistentState
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Index
import javax.persistence.Table

// *********
// * Schema *
// *********


object CaseSchema

/**
 * First version of an [LeadSchema] schema.
 */


object CaseSchemaV1 : MappedSchema(schemaFamily = CaseSchema.javaClass, version = 1, mappedTypes = listOf(PersistentCase::class.java)) {
    @Entity
    @Table(name = "leads", indexes = arrayOf(Index(name = "idx_case_owner", columnList = "owner"),
            Index(name = "idx_case_caseId", columnList = "caseId")))
    class PersistentCase(
            @Column(name = "caseId")
            var caseId: String,

            @Column(name = "description")
            var description: String,

            @Column(name = "caseNumber")
            var caseNumber: String,

            @Column(name = "status")
            var status: String,

            @Column(name = "priority")
            var priority: String,

            @Column(name = "submitter")
            var submitter: String,

            @Column(name = "resolver")
            var resolver: String,

            @Column(name = "linearId")
            var linearId: UUID


    ) : PersistentState() {
        constructor() : this("", "", "", "", "", "", "", java.util.UUID.randomUUID())
    }
}