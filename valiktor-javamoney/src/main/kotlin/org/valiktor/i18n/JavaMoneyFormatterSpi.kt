/*
 * Copyright 2018 https://www.valiktor.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.valiktor.i18n

import org.valiktor.i18n.formatters.MonetaryAmountFormatter
import javax.money.MonetaryAmount

/**
 * Represents the implementation for service provider interface for JavaMoney formatters
 *
 * @property formatters specifies the [Set] of JavaMoney formatters
 *
 * @author Rodolpho S. Couto
 * @since 0.1.0
 */
class JavaMoneyFormatterSpi : FormatterSpi {

    override val formatters = setOf(
        MonetaryAmount::class to MonetaryAmountFormatter
    )
}