/*******************************************************************************
 * Copyright 2012 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package emlab.domain.agent;

import org.springframework.data.neo4j.annotation.NodeEntity;

import agentspring.agent.Agent;
import agentspring.simulation.SimulationParameter;

@NodeEntity
public class EnergyProducer extends DecarbonizationAgent implements Agent {

    @SimulationParameter(label = "Price Mark-Up for spotmarket (as multiplier)", from = 1, to = 2)
    private double priceMarkUp;

    @SimulationParameter(label = "Long-term contract margin", from = 0, to = 1)
    private double longTermContractMargin;

    @SimulationParameter(label = "Long-term contract horizon", from = 0, to = 10)
    private double longTermContractPastTimeHorizon;

    @SimulationParameter(label = "Investment horizon", from = 0, to = 15)
    private int investmentFutureTimeHorizon;
    @SimulationParameter(label = "Equity Interest Rate", from = 0, to = 1)
    private double equityInterestRate;
    private double downpaymentFractionOfCash;
    @SimulationParameter(label = "Debt ratio in investments", from = 0, to = 1)
    private double debtRatioOfInvestments;
    private boolean willingToInvest;

    // Loan
    @SimulationParameter(label = "Loan Interest Rate", from = 0, to = 1)
    private double loanInterestRate;

    // Dismantling
    private int dismantlingProlongingYearsAfterTechnicalLifetime;
    private double dismantlingRequiredOperatingProfit;
    private long pastTimeHorizon;

    public boolean isWillingToInvest() {
        return willingToInvest;
    }

    public void setWillingToInvest(boolean willingToInvest) {
        this.willingToInvest = willingToInvest;
    }

    public double getDownpaymentFractionOfCash() {
        return downpaymentFractionOfCash;
    }

    public void setDownpaymentFractionOfCash(double downpaymentFractionOfCash) {
        this.downpaymentFractionOfCash = downpaymentFractionOfCash;
    }

    public double getLoanInterestRate() {
        return loanInterestRate;
    }

    public void setLoanInterestRate(double loanInterestRate) {
        this.loanInterestRate = loanInterestRate;
    }

    public long getPastTimeHorizon() {
        return pastTimeHorizon;
    }

    public void setPastTimeHorizon(long pastTimeHorizon) {
        this.pastTimeHorizon = pastTimeHorizon;
    }

    public int getDismantlingProlongingYearsAfterTechnicalLifetime() {
        return dismantlingProlongingYearsAfterTechnicalLifetime;
    }

    public void setDismantlingProlongingYearsAfterTechnicalLifetime(int dismantlingProlongingYearsAfterTechnicalLifetime) {
        this.dismantlingProlongingYearsAfterTechnicalLifetime = dismantlingProlongingYearsAfterTechnicalLifetime;
    }

    public double getDismantlingRequiredOperatingProfit() {
        return dismantlingRequiredOperatingProfit;
    }

    public void setDismantlingRequiredOperatingProfit(double dismantlingRequiredOperatingProfit) {
        this.dismantlingRequiredOperatingProfit = dismantlingRequiredOperatingProfit;
    }

    public int getInvestmentFutureTimeHorizon() {
        return investmentFutureTimeHorizon;
    }

    public void setInvestmentFutureTimeHorizon(int investmentFutureTimeHorizon) {
        this.investmentFutureTimeHorizon = investmentFutureTimeHorizon;
    }

    public double getEquityInterestRate() {
        return equityInterestRate;
    }

    public void setEquityInterestRate(double investmentDiscountRate) {
        this.equityInterestRate = investmentDiscountRate;
    }

    public double getLongTermContractMargin() {
        return longTermContractMargin;
    }

    public void setLongTermContractMargin(double longTermContractMargin) {
        this.longTermContractMargin = longTermContractMargin;
    }

    public double getLongTermContractPastTimeHorizon() {
        return longTermContractPastTimeHorizon;
    }

    public void setLongTermContractPastTimeHorizon(double longTermContractPastTimeHorizon) {
        this.longTermContractPastTimeHorizon = longTermContractPastTimeHorizon;
    }

    public double getDebtRatioOfInvestments() {
        return debtRatioOfInvestments;
    }

    public void setDebtRatioOfInvestments(double debtRatioOfInvestments) {
        this.debtRatioOfInvestments = debtRatioOfInvestments;
    }

    public double getPriceMarkUp() {
        return priceMarkUp;
    }

    public void setPriceMarkUp(double priceMarkUp) {
        this.priceMarkUp = priceMarkUp;
    }
}