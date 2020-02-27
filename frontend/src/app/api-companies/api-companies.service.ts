import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Company} from '../model/company' ;
import { Observable } from 'rxjs';

@Injectable()
export class ApiCompaniesService {

serviceUrl = '/api/companies' ;

constructor(private httpClient: HttpClient) {}

public getCompaniesApi(): Observable<Company[]> {
  return this.httpClient.get<Company[]>(this.serviceUrl);
}

}
