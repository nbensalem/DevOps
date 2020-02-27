import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomePageComponent } from './home-page/home-page.component';
import { ApiCompaniesComponent } from './api-companies/api-companies.component';
import {ApiCompaniesService} from './api-companies/api-companies.service';

@NgModule({
  declarations: [
    AppComponent,
    HomePageComponent,
  ApiCompaniesComponent
  ],
  imports: [
     BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [ApiCompaniesService],
  bootstrap: [AppComponent]
})
export class AppModule { }
