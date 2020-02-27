import { Component, OnInit } from '@angular/core';
import {Company} from '../model/company' ;
import { ApiCompaniesService } from './api-companies.service';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-api-companies',
  templateUrl: './api-companies.component.html',
  styleUrls: ['./api-companies.component.css']
})
export class ApiCompaniesComponent implements OnInit {

 companies: Company[] ;

  constructor(private apiCompaniesService: ApiCompaniesService ) { }

  ngOnInit() {
    this.apiCompaniesService.getCompaniesApi().subscribe
    (
      data => {
        this.companies = data;
      },
      (err: HttpErrorResponse) => {
        if (err.error instanceof Error) {
          // A client-side or network error occurred. Handle it accordingly.
          console.log('An error occurred:', err.error.message);

        } else {
          // The backend returned an unsuccessful response code.
          // The response body may contain clues as to what went wrong,
          console.log(`Backend returned code ${err.status}, body was: ${err.error}`);

        }
      }
    );

  }

}
